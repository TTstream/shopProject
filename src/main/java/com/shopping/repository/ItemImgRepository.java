package com.shopping.repository;

import com.shopping.entity.ItemImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//상품의 이미지 정보를 저장하기 위해
public interface ItemImgRepository extends JpaRepository<ItemImg,Long> {
    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);

    //상품의 대표 이미지를 찾는 쿼리 메소드 추가
    ItemImg findByItemIdAndRepimgYn(Long itemId,String repimgYn);

}
