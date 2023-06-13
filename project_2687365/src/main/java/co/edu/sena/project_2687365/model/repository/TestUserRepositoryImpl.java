package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.User;



import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        co.edu.sena.project_2687365.model.repository.Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert1 = new User();
        userInsert1.setUser_firstname("edwar");
        userInsert1.setUser_lastname("fernandez");
        userInsert1.setUser_email("edwardavid1001@gmail.com");
        userInsert1.setUser_password("edwardavidxd");
        repository.saveObj(userInsert1);

        User userInsert2 = new User();
        userInsert2.setUser_firstname("edwardo");
        userInsert2.setUser_lastname("messi");
        userInsert2.setUser_email("messias@gmail.com");
        userInsert2.setUser_password("elmessiassiuu");
        repository.saveObj(userInsert2);


        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_firstname("garet");
        userUpdate.setUser_lastname("bale");
        userUpdate.setUser_email("garetbale@gmail.com");
        userUpdate.setUser_password("garetbalexed");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

