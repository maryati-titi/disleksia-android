package dyslexia.app.repositories.database.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import dyslexia.app.repositories.database.entities.UserEntity;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<UserEntity> getAll();

    @Query("SELECT * FROM users WHERE email = :email")
    UserEntity getSingle(String email);

    @Query("SELECT * FROM users WHERE id_user = :userId")
    UserEntity getSinglebyId(Integer userId);

    @Insert
    Long insert(UserEntity userEntity);

    @Update
    Integer update(UserEntity userEntity);

    @Delete
    void delete(UserEntity userEntity);
}
