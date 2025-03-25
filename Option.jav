package com.example.votingsystem.model;

import javax.persistence.*;

@Entity
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String optionName;
    
    @ManyToOne
    @JoinColumn(name = "poll_id", nullable = false)
    private Poll poll;

    private int votes;

    // Getters and Setters
}
