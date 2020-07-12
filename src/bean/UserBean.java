package bean;

public class UserBean {
    private String id;
    private String pass;
    private String sex;
    private String name;
    private String xue;
    private String e_mail;
    private String yuan;
    private String xi;
    private String ban;
    private String nian;
    private String di;
    private String bei;

     public String getId() {
                 return id;
             }
      public void setId(String id) {
                this.id = id;
           }
      public String getPass() {
                return pass;
           }
      public void setPass(String pass) {
                 this.pass = pass;
             }
      public String getSex() {
                 return sex;
            }
      public void setSex(String sex) {
                 this.sex = sex;
             }
      public String getName() {
                return name;
            }
      public void setName(String name) {
                 this.name = name;
             }
      public String getXue() {
                return xue;
            }
      public void setXue(String xue) {
                 this.xue = xue;
             }
      public String getE_mail() {
                 return e_mail;
             }
      public void setE_mail(String e_mail) {
                 this.e_mail = e_mail;
             }
      public String getYuan() {
                 return yuan;
            }
      public void setYuan(String yuan) {
                 this.yuan = yuan;
            }
      public String getXi() {
                return xi;
            }
      public void setXi(String xi) {
                 this.xi = xi;
             }
      public String getBan() {
                 return ban;
            }
      public void setBan(String ban) {
                 this.ban = ban;
             }
      public String getNian() {
                 return nian;
             }
      public void setNian(String nian) {
                 this.nian = nian;
             }
      public String getDi() {
                 return di;
            }
      public void setDi(String di) {
                 this.di = di;
             }
      public String getBei() {
                 return bei;
             }
      public void setBei(String bei) {
                 this.bei = bei;
             }
      public UserBean() {}
      public UserBean(String Id,String Pass,String Sex,String Name,String Xue,String E_mail,String Yuan,String Xi,String Ban,String Nian,String Di,String Bei)
     {
                 this.id=Id;
                 this.pass=Pass;
                 this.sex=Sex;
                 this.name=Name;
                 this.xue=Xue;
                 this.e_mail=E_mail;
                 this.yuan=Yuan;
                 this.xi=Xi;
                 this.ban=Ban;
                 this.nian=Nian;
                this.di=Di;
                 this.bei=Bei;
             }
 }