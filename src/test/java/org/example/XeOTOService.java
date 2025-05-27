package org.example;



import java.util.ArrayList;
import java.util.List;

public class XeOTOService {

    private List<XeOTO> danhSachXe = new ArrayList<>();

    public void addXeOTO(XeOTO xe) {
        danhSachXe.add(xe);
    }

    public void updateXeOTO(XeOTO xeCapNhat, int id) {
        for (int i = 0; i < danhSachXe.size(); i++) {
            if (danhSachXe.get(i).getId() == id) {
                danhSachXe.set(i, xeCapNhat);
                break;
            }
        }
    }

    public void deleteXeOTO(int id) {
        XeOTO xeCanXoa = null;
        for (XeOTO xe : danhSachXe) {
            if (xe.getId() == id) {
                xeCanXoa = xe;
                break;
            }
        }
        if (xeCanXoa != null) {
            danhSachXe.remove(xeCanXoa);
        }
    }

    public XeOTO searchXeOTO(int id) {
        for (XeOTO xe : danhSachXe) {
            if (xe.getId() == id) {
                return xe;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public List<XeOTO> getAll() {
        return danhSachXe;
    }
}

