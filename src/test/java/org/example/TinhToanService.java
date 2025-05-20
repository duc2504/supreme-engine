package org.example;

public class TinhToanService {

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static int tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }
    public static double tinhTrungBinh(int a, int b) {
        return (a + b) / 2.0; // ép về double để lấy số thực
    }

    public static int timViTri(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí đầu tiên tìm thấy
            }
        }
        return -1; // Không tìm thấy
    }

    public static int tinhTongMang(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int tinhTongSoLe(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {  // kiểm tra số lẻ
                sum += num;
            }
        }
        return sum;
    }
    public static int demSoAm(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
    public static String kiemTraSoNguyen(int n) {
        if (n > 0) {
            return "Dương";
        } else if (n < 0) {
            return "Âm";
        } else {
            return "Bằng 0";
        }
    }



}
