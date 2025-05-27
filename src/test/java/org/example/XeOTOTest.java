package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class XeOTOTest {


    XeOTOService service;

    @BeforeEach
    public void setup() {
        service = new XeOTOService();
    }

    @Test
    public void testAddValid() {
        XeOTO xe = new XeOTO(1, "MayBack", 1000f, "Khong");
        service.addXeOTO(xe);
        Assertions.assertEquals(1, service.getAll().size());
    }

    @Test
    public void updateValid() {
        XeOTO xe = new XeOTO(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);
        XeOTO xe1 = new XeOTO(1, "MayBack" , 1000000f , "Khong");
        service.updateXeOTO(xe1, 1);
        Assertions.assertEquals(1000000f, service.getAll().get(0).getGia());
    }

    @Test
    public void deleteValid() {
        XeOTO xe = new XeOTO(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);
        int sizeBefore = service.getAll().size();
        service.deleteXeOTO(1);
        int sizeAfter = service.getAll().size();
        Assertions.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void deleteInValid() {
        XeOTO xe = new XeOTO(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);
        int sizeBefore = service.getAll().size();
        service.deleteXeOTO(1);
        int sizeAfter = service.getAll().size();
        Assertions.assertEquals(sizeBefore-1 , sizeAfter);
//         muon loi Assertions.assertEquals(sizeBefore , sizeAfter);
    }

    @Test
    public void testSearchXeOtoValid() {
        XeOTO xe = new XeOTO(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);

        XeOTO foundXeOTO = service.searchXeOTO(1);

        Assertions.assertEquals(1, foundXeOTO.getId());
    }

    @Test
    public void testSearchXeOtoInValid() {
        XeOTO xe = new XeOTO(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);

        XeOTO foundXeOTO = service.searchXeOTO(1);

        Assertions.assertEquals(1, foundXeOTO.getId());
    }
//    muon loi testSearchXeOtoInValid (2, foundXeOTO.getId());


//    3 test add
    @Test
    public void testAddMultipleXe() {
        service.addXeOTO(new XeOTO(1, "BMW", 500f, "Xe Đức"));
        service.addXeOTO(new XeOTO(2, "Toyota", 300f, "Xe Nhật"));
        Assertions.assertEquals(2, service.getAll().size());
    }

    @Test
    public void testAddXeWithNegativePrice() {
        XeOTO xe = new XeOTO(3, "Lexus", -100f, "Giá không hợp lệ");
        service.addXeOTO(xe);
        Assertions.assertEquals(-100f, service.getAll().get(0).getGia()); // Trường hợp hệ thống không kiểm tra giá
    }

    @Test
    public void testAddXeDuplicateId() {
        XeOTO xe1 = new XeOTO(4, "Ford", 400f, "Xe Mỹ");
        XeOTO xe2 = new XeOTO(4, "Honda", 350f, "Trùng ID");
        service.addXeOTO(xe1);
        service.addXeOTO(xe2);
        Assertions.assertEquals(2, service.getAll().size()); // Có thể là 2 nếu không kiểm tra trùng ID
    }

//     3 Test Delete

    @Test
    public void testDeleteFromEmptyList() {
        int sizeBefore = service.getAll().size(); // 0
        service.deleteXeOTO(10); // Không tồn tại
        int sizeAfter = service.getAll().size();
        Assertions.assertEquals(sizeBefore, sizeAfter);
    }

    @Test
    public void testDeleteTwice() {
        service.addXeOTO(new XeOTO(5, "Mazda", 600f, "Xe Nhật"));
        service.deleteXeOTO(5);
        service.deleteXeOTO(5); // Xóa lần 2
        Assertions.assertEquals(0, service.getAll().size());
    }

    @Test
    public void testDeleteWithInvalidId() {
        service.addXeOTO(new XeOTO(6, "VinFast", 700f, "Xe Việt"));
        service.deleteXeOTO(99); // ID không tồn tại
        Assertions.assertEquals(1, service.getAll().size());
    }
// 3 Test Update
@Test
public void testUpdateNonExistentId() {
    XeOTO xe = new XeOTO(7, "Hyundai", 450f, "Xe Hàn");
    service.updateXeOTO(xe, 99); // ID 99 không có
    Assertions.assertEquals(0, service.getAll().size()); // Không thêm mới
}

    @Test
    public void testUpdateWithNullNote() {
        XeOTO xe = new XeOTO(8, "KIA", 480f, null);
        service.addXeOTO(xe);
        XeOTO newXe = new XeOTO(8, "KIA", 480f, "Đã cập nhật");
        service.updateXeOTO(newXe, 8);
        Assertions.assertEquals("Đã cập nhật", service.getAll().get(0).getGhiChu());
    }

    @Test
    public void testUpdateToLowerPrice() {
        service.addXeOTO(new XeOTO(9, "Audi", 900f, "Xe Đức cao cấp"));
        XeOTO newXe = new XeOTO(9, "Audi", 600f, "Giảm giá");
        service.updateXeOTO(newXe, 9);
        Assertions.assertEquals(600f, service.getAll().get(0).getGia());
    }


}
