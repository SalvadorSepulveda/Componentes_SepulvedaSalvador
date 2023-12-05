module es.ieslosmontecillos.componentes_salvadorsepulveda {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.componentes_sepulvedasalvador to javafx.fxml;
    exports es.ieslosmontecillos.componentes_sepulvedasalvador;
}