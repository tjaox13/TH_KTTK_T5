package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue
    private Long maNV;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Luong")
    private String luong;

}
