package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        camera.recordVideo();
        factoryCam.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();
        speedCam.recordVideo();

        System.out.println(camera.getName());
        System.out.println(speedCam.getName());
        System.out.println(factoryCam.getName());

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();

    }
}
