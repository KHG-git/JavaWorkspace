package chap_07.Camera;

public class SpeedCam extends Camera {
//    public String name;


    public SpeedCam() {
     //   this.name = "과속단속 카메라";
       // this.feture = this.feture + ", 속도 측정, 동영상 촬영";
        super("과속단속카메라");
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

    public void checkSpeed(){
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature(){
        System.out.println("----------속도측정카메라-----------");
        System.out.println(super.name + "의 주요 기능 : " + this.feture);
    }

    public void takePicture(){
        //사진 촬영
        super.takePicture();
        this.checkSpeed();
        this.recognizeLicensePlate();
        //System.out.println(this.name + "사진을 촬영합니다.");
    }

}
