package com.example.sample001.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sample001.entity.AppOrderList;

public interface DBrepository extends JpaRepository<AppOrderList, Long> {

    // キャメルケースのフィールド名に対応
    List<AppOrderList> findByPartsId(String partsId);

    // ネイティブSQL（必要に応じて）
    @Query(value = "SELECT * FROM app_orderlist", nativeQuery = true)
    List<AppOrderList> findAllOrdersNative();
}
