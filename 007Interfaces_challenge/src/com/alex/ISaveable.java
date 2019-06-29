package com.timbuchalka;

import java.util.List;

//folosesti aici List<x> in loc de ArrayList
//pt flexibilitate, in viitor vei putea folosi orice fel de lista cu aceasta interfata.
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
