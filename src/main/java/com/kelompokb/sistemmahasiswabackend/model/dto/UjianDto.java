package com.kelompokb.sistemmahasiswabackend.model.dto;

import com.kelompokb.sistemmahasiswabackend.model.entity.Matkul;

public class UjianDto {

    private Integer idUjian;

    private String judulUjian;
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
