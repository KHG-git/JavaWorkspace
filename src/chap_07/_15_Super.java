package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.recordVideo();
        System.out.println("---------------------------");
        factoryCam.recordVideo();
        System.out.println("---------------------------");
        speedCam.recordVideo();
        System.out.println(">>>>");
        speedCam.takePicture();
    }
}
