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
@Table(name = "tbl_chuyenbay")
public class ChuyenBay {
    @Id
    @GeneratedValue
    private Long MaCB;

    @Column(name = "GaDi")
    private String gaDi;

    @Column(name = "GaDen")
    private String gaDen;

    @Column(name = "DoDai")
    private String doDai;

    @Column(name = "GioDi")
    private String gioDi;

    @Column(name = "GioDen")
    private String gioDen;

    @Column(name = "ChiPhi")
    private String chiPhi;
}
