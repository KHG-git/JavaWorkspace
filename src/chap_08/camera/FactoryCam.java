package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.repoter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }



    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        //System.out.println("화재를 감지합니다.");
        detector.detect();
    }

    @Override
    public void report() {
        //System.out.println("화재 신고를 진행합니다.");
        reporter.report();
    }

//    public void detect(){
//        System.out.println("화재를 감지합니다.");
//    }
//
//    public void report(){
//        System.out.println("화재 신고를 진행합니다.");
//    }
}
