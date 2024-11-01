//do while aur switch case ke concept clear karne hai
/*  package com.advjava.practice;

import java.util.Scanner;
import java.sql.*;

class bank
{
    static Connect cn;
    static int user_id, bal=0; // ***ASK SIR*** isko agar initialise nahi karo to database me value change nahi hoti hai
    static String password;
    public bank()
    {
        cn = new Connect();
        cn.connectdb();
    }
    static void admin()
    {
        Scanner ip = new Scanner(System.in);
        try
        {
            String sql, sql1, sql2;
            char choice;

            do
            {
                System.out.println("Press 1. to Display");
                System.out.println("Press 2. to Insert");
                System.out.println("Press 3. to Delete");
                int ch = ip.nextInt();

                switch (ch)
                {
                    case 1:
                        sql = "select * from user_details ORDER BY user_id;";

                        ResultSet rs = cn.stmt.executeQuery(sql);
                        while (rs.next())
                        {
                            System.out.println(rs.getInt(1) + " | " + rs.getInt(2) + " | " + rs.getString(3) + " | " + rs.getInt(4) + " | " + rs.getString(5) + " | " + rs.getInt(6) + " | " + rs.getString(7));
                        }
                        break;

                    case 2:
                        int ip_user_id, acc_no, age, balance;
                        String name, ip_password, acc_type;

                        System.out.println("Enter the User ID : ");
                        ip_user_id = ip.nextInt();
                        System.out.println("Enter the Account Number : ");
                        acc_no = ip.nextInt();
                        ip.nextLine();
                        System.out.println("Enter the Name : ");
                        name = ip.nextLine();
                        System.out.println("Enter the Age : ");
                        age = ip.nextInt();
                        ip.nextLine();
                        System.out.println("Enter the Password : ");
                        ip_password = ip.nextLine();
                        System.out.println("Enter the Balance : ");
                        balance = ip.nextInt();
                        ip.nextLine();
                        System.out.println("Enter the Account type : ");
                        acc_type = ip.nextLine();

                        sql1 = "insert into user_details values('"+ip_user_id+"','"+acc_no+"','"+name+"','"+age+"','"+ip_password+"','"+balance+"','"+acc_type+"');";

                        int result = cn.stmt.executeUpdate(sql1); //***ASK SIR*** sari jagah executeQuery me agar sql use karo to warning deta hai
                        if (result > 0)
                        {
                            System.out.println("Record inserted successfully.");
                        }
                        else
                        {
                            System.out.println("Error in record insertion.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter the User ID : ");
                        user_id = ip.nextInt();

                        sql2 = "delete from user_details where user_id = '"+user_id+"';";

                        int result2 = cn.stmt.executeUpdate(sql2);
                        if (result2 > 0)
                        {
                            System.out.println("Record deleted successfully.");
                        }
                        else
                        {
                            System.out.println("Error in record deletion.");
                        }
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                }

                System.out.println("Enter Y|y to continue.");
                System.out.println("Enter N|n to abort.");
                choice = ip.next().charAt(0);
            }
            while (choice == 'y' || choice == 'Y');
            if (choice =='n' || choice == 'N')
            {
                System.out.println("Program closed.");
            }
            else
            {
                System.out.println("Invalid response.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace(); //***ASK SIR*** SOP(e) aur ye dono warning dete hai
        }
    }

    static void customer()
    {
        Scanner ip = new Scanner(System.in);
        try {
            String sql, sql1;
            char choice;

            sql = "select * from user_details where user_id = '" + user_id + "' AND password = '" + password + "';";
            ResultSet rs = cn.stmt.executeQuery(sql);
            while (rs.next())
            {
                bal = rs.getInt(6);
            }
            sql1 = "update user_details set balance = '"+bal+"' where user_id = '"+user_id+"';";

            do
            {
                System.out.println("Press 1. to Display your details.");
                System.out.println("Press 2. to Deposit Amount");
                System.out.println("Press 3. to Withdraw Amount");
                System.out.println("Press 4. to Transfer Amount");

                int ch1 = ip.nextInt();

                switch (ch1)
                {
                    case 1:
                        sql = "select * from user_details where user_id = '" + user_id + "' AND password = '" + password + "';";
                        ResultSet rs1 = cn.stmt.executeQuery(sql);
                        while (rs1.next())
                        {
                            System.out.println(rs1.getInt(1) + " | " + rs1.getInt(2) + " | " + rs1.getString(3) + " | " + rs1.getInt(4) + " | " + rs1.getString(5) + " | " + rs1.getInt(6) + " | " + rs1.getString(7));
                        }
                        break;
                    case 2:
                        System.out.println("Enter amount to be deposited");
                        int amt_d = ip.nextInt();
                        bal = bal + amt_d;

                        int result = cn.stmt.executeUpdate("update user_details set balance = '"+bal+"' where user_id = '"+user_id+"';");
                        if (result > 0)
                        {
                            System.out.println("Balance updated successfully.");
                            System.out.println("Current Balance : " + bal);
                        }
                        else
                        {
                            System.out.println("Error in balance updation.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter denomination(Rs. 100, Rs. 200, Rs. 500, Rs. 2000) : ");
                        int den = ip.nextInt();
                        System.out.println("Enter amount to be withdrawn : ");
                        int amt_w = ip.nextInt();
                        int x = amt_w/den;
                        if (amt_w%den==0)
                        {
                            bal = bal - amt_w;

                            int result2 = cn.stmt.executeUpdate("update user_details set balance = '"+bal+"' where user_id = '"+user_id+"';");
                            if (result2 > 0)
                            {
                                System.out.println("Balance updated successfully.");
                                System.out.println("Current Balance : " + bal);
                                if (den==100)
                                {
                                    System.out.println(x +" notes of hundred denomination withdrawn.");
                                }
                                else if (den==200)
                                {
                                    System.out.println(x +" notes of two hundred denomination withdrawn.");
                                }
                                else if (den==500)
                                {
                                    System.out.println(x +" notes of five hundred denomination withdrawn.");
                                }
                                else if (den==2000)
                                {
                                    System.out.println(x +" notes of two thousand denomination withdrawn.");
                                }
                            }
                            else
                            {
                                System.out.println("Error in balance updation.");
                            }
                        }
                        else
                        {
                            System.out.println("Tranfer failed, please enter correct denomination.");
                        }
                        break;
                    case 4:
                        int r_acc_no, amt_t, bal1 = 0, bal2, bal3;
                        System.out.println("Enter Receiver's Account Number : ");
                        r_acc_no = ip.nextInt();
                        System.out.println("Enter Amount to be transferred : ");
                        amt_t = ip.nextInt();
                        ResultSet rs3 = cn.stmt.executeQuery("select * from user_details where acc_no = '"+r_acc_no+"';");
                        while (rs3.next())
                        {
                            bal1 = rs3.getInt(6);
                        }
                        bal2 = bal-amt_t;
                        bal3 = bal1+amt_t;
                        int Result = cn.stmt.executeUpdate("update user_details set balance = '"+bal2+"'  where user_id = '"+user_id+"';");
                        if (Result > 0)
                        {
                            System.out.println("Amount Deducted.");
                            System.out.println("Current Balance : " + bal2);
                        }
                        else
                        {
                            System.out.println("Error in transfer.");
                        }
                        int Result1 = cn.stmt.executeUpdate("update user_details set balance = '"+bal3+"'  where acc_no = '"+r_acc_no+"';");
                        if (Result1 > 0)
                        {
                            System.out.println("Receiver successfully received the amount .");
                        }
                        else
                        {
                            System.out.println("Error in transfer.");
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                }
                System.out.println("Enter Y|y to continue.");
                System.out.println("Enter N|n to abort.");
                choice = ip.next().charAt(0);
            }
            while (choice == 'y' || choice == 'Y');
            if (choice == 'n' || choice == 'N')
            {
                System.out.println("Program closed.");
            }
            else
            {
                System.out.println("Invalid response.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main (String[] arg)
    {
        bank ob = new bank();
        Scanner ip = new Scanner(System.in);

        String adminsql,usersql;

        System.out.println("Enter your User ID : ");
        user_id = ip.nextInt();
        ip.nextLine();
        System.out.println("Enter your Password : ");
        password = ip.nextLine();

        adminsql = "select * from admin_details where user_id = '"+user_id+"' AND password = '"+password+"';";
        usersql = "select * from user_details where user_id = '"+user_id+"' AND password = '"+password+"';";

        try
        {
            ResultSet rs = cn.stmt.executeQuery(adminsql);

            if (rs.next())
            {
                System.out.println("Admin Credentials Found.");
                ob.admin();
            }
            else
            {
                ResultSet rss = cn.stmt.executeQuery(usersql);
                if (rss.next())
                {
                    System.out.println("User Credentials Found.");
                    ob.customer();
                }
                else
                {
                    System.out.println("Invadil Credentials");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
*/
