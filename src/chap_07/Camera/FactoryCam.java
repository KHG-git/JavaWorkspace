package chap_07.Camera;

public class FactoryCam extends Camera{
//    public String name;

    public FactoryCam(){
        //this.name ="공장 카메라";
        //this.feture = this.feture + ", 화재 감지";
        super("공장 카메라");
    }

//    public void takePicture(){
//        //사진 촬영
//        System.out.println("사진을 촬영합니다.");
//    }
//
//    public void recordVideo(){
//        // 동영상 촬영
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){
        System.out.println(super.name + "의 주요 기능 : " + this.feture + " <-- 공장카메라 오버라이딩");
    }

    public void recordVideo(){
        // 동영상 촬영
        super.recordVideo();
        detectFire();
    }



}
