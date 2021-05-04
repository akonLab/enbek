package models;

public class Model {
   private Long NNP;//v_api_inyaz_res/v_api_inyaz_vak/v_api_vacancies/v_api_employers_min
    private Long UID;//v_api_inyaz_res/v_api_subscribe/v_api_vacancies/v_api_employers_min
    private String fullRname;//v_api_employers_min
    private String GOROD;//v_api_inyaz_res/v_api_inyaz_vak/v_api_vacancies/v_api_employers_min
    private  String lastName;//v_api_employers_min
    private String firstName;//v_api_employers_min
    private String parentName;///v_api_employers_min
    private String phoneNum;//v_api_employers_min  /номер телефона
    private Boolean mobPhoneNum;//v_api_employers_min   /номер мобильного телефона
    private String email;//v_api_employers_min
    private String ADRWWW;//v_api_employers_min  /название сайта
    private String fullKname;//v_api_employers_min  / название организации
    private String DECODUOZ;//v_api_employers_min  /город/v_api_vacancies
    private String OBL;//v_api_vacancies/v_api_employers_min  /область

    public Model(Long NNP, Long UID, String fullRname, String GOROD, String lastName, String firstName, String parentName, String phoneNum, Boolean mobPhoneNum, String email, String ADRWWW, String fullKname, String DECODUOZ, String OBL) {
        this.NNP = NNP;
        this.UID = UID;
        this.fullRname = fullRname;
        this.GOROD = GOROD;
        this.lastName = lastName;
        this.firstName = firstName;
        this.parentName = parentName;
        this.phoneNum = phoneNum;
        this.mobPhoneNum = mobPhoneNum;
        this.email = email;
        this.ADRWWW = ADRWWW;
        this.fullKname = fullKname;
        this.DECODUOZ = DECODUOZ;
        this.OBL = OBL;
    }
}
//1//<field name="DEREGION_ID">Г.НУР-СУЛТАН</field>
//6//<field name="OBL">     г. АСТАНА</field>

//Нур-Султан
//v_api_vacancie
//<field name="POU_NAME">Товарищество с ограниченной ответственностью &quot;СК БиП-Астана&quot;</field>
// <field name="DECODUOZ">г. Нур-Султан</field>
// <field name="DEREGION_ID">Г.НУР-СУЛТАН</field>
// <field name="PLACERAB">Главный мечеть в г. Нур-Султан,</field>

//Астана
// <field name="OBL">     г. АСТАНА</field>
// <field name="PLACERAB">Астана 10</field>
// <field name="POU_NAME">Товарищество с ограниченной ответственностью &quot;СК БиП-Астана&quot;</field>

//v_api_persons_min
//<field name="DECODUOZ">г. Нур-Султан</field>
//<field name="OBL">     г. АСТАНА</field>