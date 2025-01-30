package CmsProject2C;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DB_Model
{
    Connection con;
    Statement st;
    ResultSet rs;
    
    DB_Model()
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms_db","root","");
        st=con.createStatement();
            System.out.println("GET Connection");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    //SignUp Student............................................................
    public int ssignup(String sname,String sfname,String semail,String sid,String spn,String sdob,int spassword)
    {
        int show=0;
        try{
        String sql="insert into student_sign_up values('"+sname+"','"+sfname+"','"+semail+"','"+sid+"','"+spn+"','"+sdob+"','"+spassword+"')";
        show=st.executeUpdate(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return show;
    }
    
    //LogIn Student.............................................................
    public ResultSet slogin(String sid,int spassword)
    {
        try{
        String sql="select *from student_sign_up where S_ID='"+sid+"' and S_Password='"+spassword+"'";
        rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
         return rs;  
    }
    
 
    //SignUp Teachers...........................................................
    public int tsignup(String tname,String tfname,String temail,String tid,String tpn,String tdob,String tdepartment,String tcourse,int tpassword)
    {
        int show=0;
        try{
        String sql="insert into teacher_sign_up values('"+tname+"','"+tfname+"','"+temail+"','"+tid+"','"+tpn+"','"+tdob+"','"+tdepartment+"','"+tcourse+"','"+tpassword+"')";
        show=st.executeUpdate(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return show;
    }
    
    
    //Teacher Login.............................................................
    public ResultSet tlogin(String tid,int tpassword)
    {
        try{
        String sql="select *from teacher_sign_up where T_ID ='"+tid+"' and T_Password='"+tpassword+"'";
        rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
         return rs;  
    }
    
    //StudentRegister...........................................................
    public int studentregistration(String name, String Id,String subject,String career,String select_course,String instructor)
    {
        int show=0;
        try{
            String sql="insert into student_register values('"+name+"','"+Id+"','"+subject+"','"+career+"','"+select_course+"','"+instructor+"')";
            show=st.executeUpdate(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return show;
    }
    
    //StudentProfile............................................................
    public ResultSet studentprofileTable(String name , String id)
    {
        try{
            String sql="select *from student_register where S_Name='"+name+"' and S_ID='"+id+"' ";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    
        public ResultSet studentattendance(String tcourse)
        {
        try{
            String sql="select *from student_register where Select_Course='"+tcourse+"' ";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
        }
        
        public ResultSet coursefind(String ccode,String ID)
        {
        try{
            String sql="select *from student_register where Select_Course ='"+ccode+"' and S_ID='"+ID+"'";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
        }
        
        
        
    public int Studentgrades(String sid, String sname,String Code,String quiz , String Assignment , String Mid, String Project , String Final )
        {
        int show=0;
        try{
        String sql="insert into student_grades values('"+sid+"','"+sname+"','"+Code+"','"+quiz+"','"+Assignment+"','"+Mid+"','"+Project+"','"+Final+"')";
        show=st.executeUpdate(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return show;
    }
    
    
    
    //get Records
        public ResultSet getgrades(String id,String name)
        {
        try{
        String sql="select *from student_grades where S_ID='"+id+"' and S_Name='"+name+"'";
        rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
         return rs;  
    }
        //admin
        public ResultSet AdminStudent()
    {
        try{
            String sql="select *from student_sign_up";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
         //SearchStudent............................................................
    public ResultSet searchtable(String id)
    {
        try
        {
            String sql="select *from  student_sign_up where S_Name='"+id+"' or S_ID='"+id+"'";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
   
    //deleterecord..............................................................
    public int deleterecordStudent(String id)
            {
                int show=0;
                try
                {
                    String sql="delete from student_sign_up where S_ID='"+id+"'";
                    show=st.executeUpdate(sql);
                    System.out.println(show);
                }catch(Exception e)
                {
                    System.out.println(e);
                }
                return show;
            }
   
    //teacherAdminTable............................................................
        public ResultSet AdminTeacher()
    {
        try{
            String sql="select *from teacher_sign_up";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
         //SearchTeacherAdmin............................................................
    public ResultSet searchteacher(String id)
    {
        try
        {
            String sql="select *from  teacher_sign_up where T_Name='"+id+"' or T_ID='"+id+"'";
            rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
   
    //deleterecordteacherAdmin..............................................................
    public int deleteTeacheradmin(String id)
            {
                int show=0;
                try
                {
                    String sql="delete from teacher_sign_up where T_ID='"+id+"'";
                    show=st.executeUpdate(sql);
                    System.out.println(show);
                }catch(Exception e)
                {
                    System.out.println(e);
                }
                return show;
            }
    
   /* 
    public int updateRecordStudent(String id1,String sname,String sfname,String semail,String spn,String sdob,int spassword){
      int s=0;   
    try {
        String sql="update  student_sign_up Set S_Name='"+sname+"', S_FName='"+sfname+"', S_Email='"+semail+"',S_PNumber='"+spn+"', S_DOB='"+sdob+"',S_Password='"+spassword+"' where S_ID='"+id1+"'";
      
            s=st.executeUpdate(sql);
            System.out.println(s);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return s;
    
}


public ResultSet getRecordByIDStudent(String id){
 
    
        try {
            String sql="select * from student_sign_up  where S_ID='"+id+"'";
            rs=st.executeQuery(sql);
            System.out.println(rs);
            System.out.println("id matched");
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
        return rs;
      

}

   */
    
    //AdminUpdateStudentRecords.................................................
    public int updateStudentRecord(String id,String sname,String sfname,String semail,String spn,String sdob,int spassword){
      int s=0;   
    try {
          
            String sql="update student_sign_up set S_Name='"+sname+"', S_FName='"+sfname+"',S_Email='"+semail+"',S_PNumber='"+spn+"', S_DOB='"+sdob+"',S_Password='"+spassword+"' where S_ID='"+id+"'";
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
}


public ResultSet getRecordByID(String id){
 
    
        try {
            String sql="select * from student_sign_up where S_ID='"+id+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
      

}


 //AdminUpdateTeacherRecords.................................................
    public int updateTeacherRecord(String tname,String tfname,String temail,String tid,String tpn,String tdob,
            String tdepartment,String tcourse,int tpassword){
      int s=0;   
    try {
          
            String sql="update teacher_sign_up set T_Name='"+tname+"', T_FName='"+tfname+"', T_Email='"+temail+"',"
                    + "T_PNumber='"+tpn+"', T_DOB='"+tdob+"',T_Department='"+tdepartment+"',T_CourseCode='"+tcourse+"',"
                    + "T_Password='"+tpassword+"' where T_ID='"+tid+"'";
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
}


public ResultSet getRecordByIDT(String id){
 
    
        try {
            String sql="select * from teacher_sign_up where T_ID='"+id+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
   
}
     public ResultSet getRecordByIDTeacher(String tname, String tcourse){
 
    
        try {
            String sql="select * from teacher_sign_up where T_Name='"+tname+"' and T_CourseCode='"+tcourse+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
   
}


    public ResultSet getStudentGrade(String id){
 
    
        try {
            String sql="select * from student_grades where C_code='"+id+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
   
}
    
    
    
    public int attendancesaved(String date, String sid,String sname,String scode,String status )
        {
        int show=0;
        try{
        String sql="insert into student_attendance values('"+date+"','"+sid+"','"+sname+"','"+scode+"','"+status+"')";
        show=st.executeUpdate(sql);
            System.out.println("ins");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return show;
    }
    
    
    public ResultSet showattendance()
    {
        try{
        String sql="select *from student_attendance";
        rs=st.executeQuery(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
         return rs;  
    }
      public static void main(String args[])
      {
          DB_Model db=new DB_Model();
      }

}