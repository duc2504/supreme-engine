package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhToan {

    TinhToanService service = new TinhToanService();

    @Test
    public void tinhTong1_cau1() {
        assertEquals(15, service.tinhTong(5, 10));
    }

    @Test
    public void tinhTong2_cau1() {
        assertEquals(14, service.tinhTong(4, 10));
    }

    @Test
    public void tinhTong3_cau1() {
        assertEquals(16, service.tinhTong(6, 10));
    }

    @Test
    public void tinhTong4_cau1() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5_cau1() {
        assertEquals(20, service.tinhTong(10, 10));
    }


    @Test
    public void tinhHieu1_cau2() {
        assertEquals(-5, service.tinhHieu(5, 10));
    }

    @Test
    public void tinhHieu2_cau2() {
        assertEquals(-6, service.tinhHieu(4, 10));
    }

    @Test
    public void tinhHieu3_cau2() {
        assertEquals(-4, service.tinhHieu(6, 10));
    }

    @Test
    public void tinhHieu4_cau2() {
        assertEquals(-1, service.tinhHieu(9, 10));
    }

    @Test
    public void tinhHieu5_cau2() {
        assertEquals(0, service.tinhHieu(10, 10));
    }

    // ----------- Tests for tinhTich -----------
    @Test
    public void tinhTich1_cau3() {
        assertEquals(50, service.tinhTich(5, 10));
    }

    @Test
    public void tinhTich2_cau3() {
        assertEquals(40, service.tinhTich(4, 10));
    }

    @Test
    public void tinhTich3_cau3() {
        assertEquals(60, service.tinhTich(6, 10));
    }

    @Test
    public void tinhTich4() {
        assertEquals(90, service.tinhTich(9, 10));
    }

    @Test
    public void tinhTich5() {
        assertEquals(100, service.tinhTich(10, 10));
    }

    // ----------- Tests for tinhThuong -----------
    @Test
    public void tinhThuong1_cau4() {
        assertEquals(0, service.tinhThuong(5, 10));
    }

    @Test
    public void tinhThuong2() {
        assertEquals(0, service.tinhThuong(4, 10));
    }

    @Test
    public void tinhThuong3() {
        assertEquals(0, service.tinhThuong(6, 10));
    }

    @Test
    public void tinhThuong4() {
        assertEquals(0, service.tinhThuong(9, 10));
    }

    @Test
    public void tinhThuong5() {
        assertEquals(1, service.tinhThuong(10, 10));
    }


    @Test
    public void tinhTrungBinh1_cau5() {
        assertEquals(7.5, service.tinhTrungBinh(5, 10));
    }

    @Test
    public void tinhTrungBinh2() {
        assertEquals(7.0, service.tinhTrungBinh(4, 10));
    }

    @Test
    public void tinhTrungBinh3() {
        assertEquals(8.0, service.tinhTrungBinh(6, 10));
    }

    @Test
    public void tinhTrungBinh4() {
        assertEquals(9.5, service.tinhTrungBinh(9, 10), 0.0001);
    }

    @Test
    public void tinhTrungBinh5() {
        assertEquals(10.0, service.tinhTrungBinh(10, 10), 0.0001);
    }
    @Test
    public void timViTri1_cau6() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, service.timViTri(arr, 1));
    }

    @Test
    public void timViTri2() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(2, service.timViTri(arr, 6));
    }

    @Test
    public void timViTri3() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(4, service.timViTri(arr, 50));
    }

    @Test
    public void timViTri4() {
        int[] arr = {5, 15, 25, 35};
        assertEquals(-1, service.timViTri(arr, 100)); // không có 100 trong mảng
    }

    @Test
    public void timViTri5() {
        int[] arr = {7, 8, 9, 7, 10};
        assertEquals(0, service.timViTri(arr, 7)); // lấy vị trí đầu tiên (index 0)
    }
    @Test
    public void tinhTongMang1_cau7() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, service.tinhTongMang(arr));
    }

    @Test
    public void tinhTongMang2() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0, service.tinhTongMang(arr));
    }

    @Test
    public void tinhTongMang3() {
        int[] arr = {-1, -2, -3};
        assertEquals(-6, service.tinhTongMang(arr));
    }

    @Test
    public void tinhTongMang4() {
        int[] arr = {100};
        assertEquals(100, service.tinhTongMang(arr));
    }

    @Test
    public void tinhTongMang5() {
        int[] arr = {};
        assertEquals(0, service.tinhTongMang(arr));  // mảng rỗng trả về 0
    }

    @Test
    public void tinhTongSoLe1_cau8() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(9, service.tinhTongSoLe(arr));  // 1 + 3 + 5 = 9
    }

    @Test
    public void tinhTongSoLe2() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(0, service.tinhTongSoLe(arr));  // không có số lẻ
    }

    @Test
    public void tinhTongSoLe3() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(4, service.tinhTongSoLe(arr));  // 1 + 1 + 1 + 1 = 4
    }

    @Test
    public void tinhTongSoLe4() {
        int[] arr = {-1, -3, 2, 4};
        assertEquals(-4, service.tinhTongSoLe(arr));  // -1 + -3 = -4
    }

    @Test
    public void tinhTongSoLe5() {
        int[] arr = {};
        assertEquals(0, service.tinhTongSoLe(arr));  // mảng rỗng
    }



    @Test
    public void demSoAm1_cau9() {
        int[] arr = {-5, 6, -7, -9, 0, -1};
        assertEquals(4, service.demSoAm(arr));  // -5, -7, -9, -1 là số âm
    }

    @Test
    public void demSoAm2() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(0, service.demSoAm(arr));  // không có số âm
    }

    @Test
    public void demSoAm3() {
        int[] arr = {-1, -2, -3};
        assertEquals(3, service.demSoAm(arr));  // tất cả đều âm
    }

    @Test
    public void demSoAm4() {
        int[] arr = {0, 0, 0};
        assertEquals(0, service.demSoAm(arr));  // toàn số 0 (không âm)
    }

    @Test
    public void demSoAm5() {
        int[] arr = {};
        assertEquals(0, service.demSoAm(arr));  // mảng rỗng
    }
    @Test
    public void testKiemTraSoNguyen1_cau10() {
        assertEquals("Dương", service.kiemTraSoNguyen(5));
    }

    @Test
    public void testKiemTraSoNguyen2() {
        assertEquals("Âm", service.kiemTraSoNguyen(-10));
    }

    @Test
    public void testKiemTraSoNguyen3() {
        assertEquals("Bằng 0", service.kiemTraSoNguyen(0));
    }

    @Test
    public void testKiemTraSoNguyen4() {
        assertEquals("Dương", service.kiemTraSoNguyen(1));
    }

    @Test
    public void testKiemTraSoNguyen5() {
        assertEquals("Âm", service.kiemTraSoNguyen(-1));
    }


}