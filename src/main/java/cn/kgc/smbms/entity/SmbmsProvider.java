package cn.kgc.smbms.entity;

public class SmbmsProvider {

    private Integer id;
    private String proName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }


    public SmbmsProvider() {
    }

    public SmbmsProvider(Integer id, String proName) {
        this.id = id;
        this.proName = proName;
    }


    @Override
    public String toString() {
        return "SmbmsProvider{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                '}';
    }
}
