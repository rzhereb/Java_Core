package lesson9;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";


    public static void main(String[] args) throws IOException, SQLException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//        OutputStream outputStream = httpURLConnection.getOutputStream();
//        PrintWriter printWriter = new PrintWriter(outputStream);
        int responseCode = httpURLConnection.getResponseCode();
        StringBuilder responseBody = new StringBuilder();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                responseBody.append(s + "\n");
            }
        } else {
            System.out.println("Something wrong, HTTP Code = " + responseCode);
        }


        JSONArray jsonArray = new JSONArray(responseBody.toString());
        List<User> userList = jsonArray.toList().stream().map(object -> {
            JSONObject jsonObject = new JSONObject((HashMap) object);
            User user = new User();
            user.setId(jsonObject.getInt("id"));
            user.setUserId(jsonObject.getInt("userId"));
            user.setTitle(jsonObject.getString("title"));
            user.setBody(jsonObject.getString("body"));
            return user;
        }).collect(Collectors.toList());

//        userList.forEach(System.out::println);


        //JDBC

        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        connection.createStatement().execute("CREATE TABLE `mydb`.`USER` (\n" +
//                "  `id` INT NOT NULL,\n" +
//                "  `userId` INT NOT NULL,\n" +
//                "  `title` VARCHAR(45) NOT NULL,\n" +
//                "  `body` VARCHAR(300) NOT NULL,\n" +
//                "  PRIMARY KEY (`id`));\n ");

//        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO USER (id, userId, title, body) VALUES (?, ?, ?, ?)");
//        userList.forEach(user -> {
//            try {
//                preparedStatement.setInt(1, user.getId());
//                preparedStatement.setInt(2, user.getUserId());
//                preparedStatement.setString(3, user.getTitle());
//                preparedStatement.setString(4, user.getBody());
//                preparedStatement.executeUpdate();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        });
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM USER");
        List<User> usersFromDB = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int userId = resultSet.getInt("userId");
            String title = resultSet.getString("title");
            String body = resultSet.getString("body");
            usersFromDB.add(new User(id, userId, title, body));
        }
        connection.close();

        usersFromDB.forEach(System.out::println);

    }
}
