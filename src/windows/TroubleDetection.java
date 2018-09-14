package windows;

public class TroubleDetection {
    private boolean is_detected = false;
    private int err_code = 0;
    /*
    0 : Something Happen
    1 : Too High
    2 : Too Low
     */

    TroubleDetection(){

    }
    private void sendTransection(int id, int status, int err_code){     //web3j 써가지고 스마트 컨트랙트 실행
        //id : 패널 id
        //status : 현재 값
        //err_code : 에러코드
        //somefunction("id"가 "STATUS"이고 에러코드가 ERR_CODE이다. ) 이렇게 보내버리면 어떨까 하는데
        //그니까 id가 각각 패널의 고유 id임. 예를들어 speed, voltage이런거
        //그러니까 만약에 0, 400, 1을 매개변수로 주면
        //0 : 속도, 400 : 현재값이 400, 1 : 존나높다. 라고 해석할수 있으면 좋지ㅏㄶ을까.

    }
    public int troubleDetection(int id, int status) {

        if (id == InformationList.SPEED.ordinal()) {
            if (status > 200) {
                //too fast
                is_detected = true;
                err_code = 1;
            }
        } else if (id == InformationList.RPM.ordinal()) {
            if (status > 6000) {
                //boom
                is_detected = true;
                err_code = 1;
            }
        } else if (id == InformationList.ENGINELOAD.ordinal()) {
            //이건 진짜 모르겠다.

        } else if (id == InformationList.ENGINETEMP.ordinal()) {
            if (status > 300) {
                //온도 개높음
                is_detected = true;
                err_code = 1;
            } else if (status < 30) {
                //온도 개낮음
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.FUEL_ECONOMY.ordinal()) {

        } else if (id == InformationList.TODAY_DRIVEN.ordinal()) {

        } else if (id == InformationList.TOTAL_DISTANCE.ordinal()) {

        } else if (id == InformationList.COLLISION.ordinal()) {
            if (status == 1) {
                //collision occur
                is_detected = true;
                err_code = 0;
            }
        } else if (id == InformationList.BATTERY_RAMAIN.ordinal()) {
            if (status < 20) {
                //얼마 안남음 ㅡㅡ
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.BATTERY_VOLTAGE.ordinal()) {
            if (status > 15) {
                //존나크네 시발
                is_detected = true;
                err_code = 1;
            } else if (status < 10) {
                //시동 안들어옴 ㅅㄱ
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.BATTERY_TEMP.ordinal()) {
            if (status > 300) {
                //boom
                is_detected = true;
                err_code = 1;
            }
        } else if (id == InformationList.BATTERY_LIFE.ordinal()) {

            if (status < 10) {
                //warning
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.TIRE_TL.ordinal()) {
            if (status > 45) {
                is_detected = true;
                err_code = 1;
            } else if (status < 10) {
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.TIRE_TR.ordinal()) {
            if (status > 45) {
                is_detected = true;
                err_code = 1;
            } else if (status < 10) {
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.TIRE_BL.ordinal()) {
            if (status > 45) {
                is_detected = true;
                err_code = 1;
            } else if (status < 10) {
                is_detected = true;
                err_code = 2;
            }
        } else if (id == InformationList.TIRE_BR.ordinal()) {
            if (status > 45) {
                is_detected = true;
                err_code = 1;
            } else if (status < 10) {
                is_detected = true;
                err_code = 2;
            }
        } else {
            is_detected = false;
        }
        if (is_detected){
            sendTransection(id, status, err_code);
        }
        return 0;
    }
}
