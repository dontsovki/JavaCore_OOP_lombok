package org.example.pacedg;

import lombok.*;

@Getter //Библиотека ламбок - добавляющий гетор полю
@Setter //Библиотека ламбок - добавляющий сетор полю
@AllArgsConstructor //Библиотека ламбок - добавляющий конструктор
@EqualsAndHashCode //Библиотека ламбок - добавляющий Equals и HashCode
@NoArgsConstructor //Библиотека ламбок - добавляющий пустой конструктор
@ToString
public class Persen {
    private int age;

}
