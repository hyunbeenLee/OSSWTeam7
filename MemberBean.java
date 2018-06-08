package getcard;
 
// 회원정보를 담을 자바빈
public class MemberBean 
{
    // 아이디, 비밀번호, 주소, 전화를 담을 맴버변수
    // 프로퍼티에 직접 접근할 수 없게 private를 사용.
    private String id;
    private String pw;
    private String addr;
    private String tel;
    
    /* 데이터를 가져오거나 세팅하는
    *  기능을 하는 메서드를 만든다.
    *  - 데이터를 가져오는 경우 - get메서드
    *  - 데이터를 세팅하는 경우 - set메서드
    */
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }    
}
