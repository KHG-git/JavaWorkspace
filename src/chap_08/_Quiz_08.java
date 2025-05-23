package chap_08;

import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.repoter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        AccidentDetector accidentDetector = new AccidentDetector();
        VideoReporter videoReporter = new VideoReporter();

        speedCam.setDetector(accidentDetector);
        speedCam.setReporter(videoReporter);
        speedCam.detect();
        speedCam.report();
    }
}
