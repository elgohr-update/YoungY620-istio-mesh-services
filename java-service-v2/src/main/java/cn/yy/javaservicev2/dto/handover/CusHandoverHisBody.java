package cn.yy.javaservicev2.dto.handover;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CusHandoverHisBody  implements Serializable {
    List<CusHandoverHisEntry> entries;
}
