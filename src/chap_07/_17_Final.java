package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVide();
        //actionCam.lens = "일반렌즈";
        actionCam.makeVide();

        System.out.println("-----------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVide();
    }
}
