package com.example.sample001.repository;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sample001.entity.AppOrderList;

public interface DBrepository extends JpaRepository<AppOrderList, Long> {

    // キャメルケース対応したフィールドを使って検索
    List<AppOrderList> findByParts_id(String parts_id);

    // ネイティブSQLで全件取得
    @Query(value = "SELECT * FROM app_orderlist", nativeQuery = true)
    List<AppOrderList> findAllOrdersNative();
    @Entity
    public class AppOrderList {

        @Id
        private Long id;

        private String parts_id;  // ← Javaフィールド名をキャメルケースに
    }
}
