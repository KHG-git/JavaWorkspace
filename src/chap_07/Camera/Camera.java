package chap_07.Camera;

//부모 클래스
public class Camera {
    public String name;
    protected String feture = "사진 촬영, 동영상 녹화";

    public Camera() {
        this.name = "카메라";
    }

    public Camera(String name) {
        this.name = name;
    }

    public void takePicture(){
        //사진 촬영
        System.out.println(this.name + "사진을 촬영합니다.");
    }

    public void recordVideo(){
        // 동영상 촬영
        System.out.println(this.name + " 동영상을 녹화합니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : " + this.feture);
    }
}
