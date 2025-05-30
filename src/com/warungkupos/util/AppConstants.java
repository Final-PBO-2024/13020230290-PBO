package com.warungkupos.util;

import java.awt.Color;

public final class AppConstants {

    private AppConstants() {
        // Kelas ini tidak untuk diinstansiasi
    }

    // Informasi Aplikasi
    public static final String APPLICATION_NAME = "WarungKu"; // <--- PERUBAHAN DI SINI
    public static final String APPLICATION_VERSION = "1.0.0";

    // Peran Pengguna (User Roles)
    public static final String ROLE_ADMIN = "Admin";
    public static final String ROLE_CUSTOMER = "Customer";

    // Konstanta untuk GUI
    public static final String LOGIN_TITLE = "Login - " + APPLICATION_NAME;
    public static final String SIGNUP_TITLE = "Registrasi - " + APPLICATION_NAME;
    public static final String ADMIN_DASHBOARD_TITLE = "Admin Dashboard - " + APPLICATION_NAME;
    public static final String CUSTOMER_DASHBOARD_TITLE = "Selamat Datang di " + APPLICATION_NAME;

    // Warna Tema
    public static final Color COLOR_PRIMARY_BLUE = new Color(0, 102, 102); 
    public static final Color COLOR_WHITE = Color.WHITE;
    public static final Color COLOR_BACKGROUND_LIGHT = new Color(240, 240, 240);
    public static final Color COLOR_TEXT_DARK = Color.DARK_GRAY;
    public static final Color COLOR_BUTTON_HOVER = new Color(0, 122, 122);
    public static final Color COLOR_ERROR_RED = new Color(200, 0, 0);


    // Notifikasi dan Pesan
    public static final String MSG_REGISTRATION_SUCCESS = "Registrasi berhasil! Silakan login.";
    public static final String MSG_INPUT_INVALID = "Input tidak valid. Mohon periksa kembali data Anda.";
    public static final String MSG_OPERATION_SUCCESS = "Operasi berhasil.";
    public static final String MSG_OPERATION_FAILED = "Operasi gagal.";
    public static final String MSG_CONFIRM_DELETE = "Apakah Anda yakin ingin menghapus item ini?";
    public static final String MSG_CONFIRM_LOGOUT = "Apakah Anda yakin ingin logout?";

    // Batas Stok Rendah (default)
    public static final int DEFAULT_LOW_STOCK_THRESHOLD = 5;

    // Default values
    public static final String DEFAULT_IMAGE_PATH = "/images/default_product_image.png"; 
    public static final String LOGO_PATH = "/images/warungku_logo.png"; 
}