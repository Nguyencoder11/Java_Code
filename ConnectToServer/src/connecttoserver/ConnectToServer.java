/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connecttoserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class ConnectToServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        var server = "LAPTOP-114BJP49";
//        var db = "QLDIEM";
//        var port = 1433;
//        SQLServerDataSource ds = new SQLServerDataSource();

        // Tạo một JFrame mới
        JFrame frame = new JFrame("Java Swing App");

        // Thiết lập kích thước cửa sổ
        frame.setSize(300, 200);

        // Đảm bảo ứng dụng kết thúc khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JLabel để hiển thị văn bản
//        JLabel label = new JLabel("Xin chào, đây là ứng dụng Java Swing đầu tiên của bạn!");

        // Thêm label vào frame
//        frame.add(label);

        // Hiển thị frame
        frame.setVisible(true);

    }

}
