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
@Table(name = "tbl_maybay")
public class MayBay {
    @Id
    @GeneratedValue
    private Long maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private String tamBay;
}
