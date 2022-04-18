package com.ms.msemail.repositories;

import com.ms.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IEmailRepository extends JpaRepository<EmailModel, UUID> {
}
