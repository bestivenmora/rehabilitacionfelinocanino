


    String nombre = request.getParameter("nombre");
    

    ArrayList<Mascota> mascotas = (ArrayList<Mascota>) session.getAttribute("mascotas");
    if (mascotas != null) {

        Mascota mascotaEncontrada = null;
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                mascotaEncontrada = mascota;
                break;
            }
        }
        
        if (mascotaEncontrada != null) {
            mascotas.remove(mascotaEncontrada);
        }
    }
    response.sendRedirect("../index.html");

