package com.bots.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bots.beans.PaymentDetails;

@Repository
public interface PaymentDao extends JpaRepository<PaymentDetails, Integer> 
{

}
