package dao;

  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.util.ArrayList;
  import java.util.List;
  import  bean.UserBean;
  import  util.DBUtil;

     public class UserDao {
     public static void main(String[] args)

             /**
       * 注册
       * @param userBean
       */
             public void reg(UserBean userBean) {
                 String sql = "insert into login(Id,Pass,Sex,Name,Xue,E_mail,Yuan,Xi,Ban,Nian,Di,Bei) values('"+userBean.getId()+"','"+userBean.getPass()+"','"+userBean.getSex()+"','"+userBean.getName()+"','"+userBean.getXue()+"','"+userBean.getE_mail()+"','"+userBean.getYuan()+"','"+userBean.getXi()+"','"+userBean.getBan()+"','"+userBean.getNian()+"','"+userBean.getDi()+"','"+userBean.getBei()+"')";
                 Connection conn = DBUtil.getConn();
                 Statement state = null;
                 try {
                         state = conn.createStatement();
                         state.executeUpdate(sql);
                     } catch (Exception e) {
                         e.printStackTrace();
                     }finally{
                         DBUtil.close(state, conn);
                     }
             }
 }