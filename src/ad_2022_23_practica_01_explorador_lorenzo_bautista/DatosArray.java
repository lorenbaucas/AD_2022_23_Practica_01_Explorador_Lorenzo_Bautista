package ad_2022_23_practica_01_explorador_lorenzo_bautista;

/**
 *
 * @author Loren Baucas
 */
public class DatosArray {
    private String nombre;
    private String extension;
    private String archivoDirectorio;
    private long tamanio;
    private boolean esArchivo;

    public DatosArray(String nombre, String extension, long tamanio, boolean esArchivo) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.esArchivo = esArchivo;
        if (esArchivo==true){
            archivoDirectorio="Archivo";
        }
        else{
            archivoDirectorio="Directorio";
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getArchivoDirectorio() {
        return archivoDirectorio;
    }

    public void setArchivoDirectorio(String archivoDirectorio) {
        this.archivoDirectorio = archivoDirectorio;
    }

    public long getTamaño() {
        return tamanio;
    }

    public void setTamaño(long tamaño) {
        this.tamanio = tamaño;
    }

    public boolean isEsArchivo() {
        return esArchivo;
    }

    public void setEsArchivo(boolean esArchivo) {
        this.esArchivo = esArchivo;
    }
}
