package adaptech;

import java.sql.*;


public class DatabaseConnectivity {

    Statement statement;
    ResultSet resultSet;
    String query;

    static Connection setConnection() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        //establishing connection
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/adapt_tech","root","");

    }

    public boolean checkLogin(String Username, String PassWord) throws Exception{

        boolean flag=false;
            statement=DatabaseConnectivity.setConnection().createStatement();
            query="select username , password from applicant_user where username ='" + Username + "' and password = '" + PassWord + "'";
            resultSet=statement.executeQuery(query);

          if(resultSet.next()){
              System.out.println(resultSet.getString(1));
              flag=true;
          }

        return flag;

    }

    public void insertApplicantInformation(String tablename, String fullname, String username, String email, int contact, String qualification, String gender, String city, String password) throws Exception {

        statement=DatabaseConnectivity.setConnection().createStatement();
        String query = "Insert into "+tablename+" values('"+fullname+"','"+username+"','"+email+"',"+contact+",'"+qualification+"','"+gender+"','"+city+"','"+password+"',current_date())";
        String query1 = "insert into applicant_user values ( '" + username + "','" + password + "')";
        statement.executeUpdate(query);
        statement.executeUpdate(query1);

    }

    public void insertApplicantSuggestion(String name, String email, String suggetion) throws Exception {

        statement=DatabaseConnectivity.setConnection().createStatement();
        String query1 = "insert into applicant_suggestion values ( '" + name + "','" + email + "','" + suggetion +"')";
        statement.executeUpdate(query1);

    }

    public void insertApplicantMarks(int marks,String username) throws Exception {

        statement=DatabaseConnectivity.setConnection().createStatement();
        String query1 = "insert into applicant_marks values ( '" + username + "','" + marks + "',current_date())";
        statement.executeUpdate(query1);

    }

    public ResultSet displayMarks() throws Exception {

      statement=DatabaseConnectivity.setConnection().createStatement();
      query="select * from applicant_marks";
      resultSet=statement.executeQuery(query);

      System.out.println("hi");
      return resultSet;

    }

    public ResultSet displaySuggestions() throws Exception {

      statement=DatabaseConnectivity.setConnection().createStatement();
      query="select * from applicant_suggestion";
      resultSet=statement.executeQuery(query);

      System.out.println("hi");
      return resultSet;

    }

    public void setNewPassword(String username,String password) throws Exception {

      statement=DatabaseConnectivity.setConnection().createStatement();
      String query = "Update applicant_information set password = '"+password +"' where username = '"+username+"'";
      String query2 = "Update applicant_user set password = '"+password +"' where username = '"+username+"'";
      statement.executeUpdate(query);
      statement.executeUpdate(query2);

    }

}
