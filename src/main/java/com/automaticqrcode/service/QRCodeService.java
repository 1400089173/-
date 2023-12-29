package com.automaticqrcode.service;

import org.springframework.stereotype.Service;


public interface QRCodeService {
    byte[] generateQRCode(String qrContent, int width, int height);
}
