package com.kelompokb.sistemmahasiswabackend.model.entity;

import com.kelompokb.sistemmahasiswabackend.model.dto.UjianDto;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tab_ujian")
public class Ujian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id_ujian")
    private Integer idUjian;

    @Column(name = "judul_ujian")
    private String judulUjian;

    @Column(name = "stat_ujian")
    private String statUjian;

    public Integer getIdUjian() {
        return idUjian;
    }

    public void setIdUjian(Integer idUjian) {
        this.idUjian = idUjian;
    }

    public String getJudulUjian() {
        return judulUjian;
    }

    public void setJudulUjian(String judulUjian) {
        this.judulUjian = judulUjian;
    }

    public String getStatUjian() {
        return statUjian;
    }

    public void setStatUjian(String statUjian) {
        this.statUjian = statUjian;
    }
}
