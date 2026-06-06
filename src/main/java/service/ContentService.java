package service;

import knowledge.KnowledgeBase;
import knowledge.PresentationMode;
import model.Content;

public class ContentService {
    public Content  getContent(){
        KnowledgeBase kb = KnowledgeBase.getInstance();
        PresentationMode currentMode = kb.getState().getCurrentMode();

        Content content = new Content("Patrones de Software", "Aprendamos de buenas prácticas");

        switch (currentMode){
            case MULTIMEDIA:
                content.setImgUrl("https://mi-servidor.com/imagenes/arquitectura.png");
                content.setVideoUrl("https://mi-servidor.com/videos/clase_mapek.mp4");
                break;

            case RESTRICTED:
                content.setImgUrl("https://mi-servidor.com/imagenes/arquitectura.png");
                break;
            case TEXT:
                content.setDescription("Resumen: Diseño de sistemas autoadaptativos.");
                content.setMessage("Las imágenes, videos y enlaces multimedia fueron desactivados temporalmente debido a alta demanda.");
                break;
        }

        return content;

    }
}
