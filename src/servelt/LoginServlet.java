package servelt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.UserBean;
import dao.UserDao;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();

        String Id = req.getParameter("Id");
        String Pass = req.getParameter("Pass");
        String Name = req.getParameter("Name");
        String Sex = req.getParameter("Sex");
        String Xue = req.getParameter("Xue");
        String Di = req.getParameter("Di");
        String Yuan = req.getParameter("Yuan");
        String E_mail = req.getParameter("E_mail");
        String Xi = req.getParameter("Xi");
        String Ban = req.getParameter("Ban");
        String Nian = req.getParameter("Nian");
        String Bei = req.getParameter("Bei");
        UserDao adminDao = new UserDao();
        UserBean a=new UserBean();
        a.setId(Id);
        a.setPass(Pass);
        a.setName(Name);
        a.setXue(Xue);
        a.setSex(Sex);
        a.setDi(Di);
        a.setXi(Xi);
        a.setBan(Ban);
        a.setNian(Nian);
        a.setBei(Bei);
        a.setE_mail(E_mail);
        a.setYuan(Yuan);
        adminDao.reg(a);
        resp.sendRedirect(req.getContextPath() + "/Sussess.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
