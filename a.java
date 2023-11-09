LinkedList<Candidato> candidatos;
    Map<Candidato, Integer> votos;

try {
    cantidadP = Integer.valueOf(cantidadPT);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(rootPane, "No es una numero la cantidad de P");
    return;
}

private DefaultListModel<String> listCandidatos = new DefaultListModel<>();
private DefaultListModel<String> listBotos = new DefaultListModel<>();

if(listCandidatos.getSize() > 0) {
    for (Candidato candito : candidatos) {
        for (int i = 0; i < listCandidatos.getSize(); i++) {
            String partido = listCandidatos.getElementAt(i);
            if(candito.getPartidoMilita().equals(partido)) {
                canditosG.add(candito);
            }
        }
    }
} else {
    JOptionPane.showMessageDialog(rootPane, "No Tiene Candidatos");
    return;
}

jlsBotos.setModel(listBotos);

public class MisExepciones extends Exception{

    public MisExepciones(String message) {
        super(message);
    }
}

private void cargarDatos() {
    DefaultTableModel tabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    Object[] colum = {"ID", "Agente"};
    tabla.setColumnIdentifiers(colum);

    LinkedList<String> listaBoletas = fileHadler.reporte();
    for (String boleta : listaBoletas) {
        Object[] data = boleta.split(",");
        tabla.addRow(data);
    }

    tblReporte.setModel(tabla);
}

public Map<Candidato, Integer> listaCandidatosParlamento() {
        Map<Candidato, Integer> listaCandidatosP = new HashMap<>();

        for (Boleta boleta : boletas) {
            if(boleta instanceof ParlamentoAndino boletaPar) {
                LinkedList<Candidato> candidatos = boletaPar.getCandidatos();
                Map<Candidato, Integer> votos = boletaPar.getVotos();
                for (Candidato candidato : candidatos) {
                    int newVoto = votos.get(candidato);
                    if(listaCandidatosP.containsKey(candidato)) {
                        int votoAct = listaCandidatosP.get(candidato);
                        listaCandidatosP.put(candidato, votoAct+newVoto);
                    } else {
                        listaCandidatosP.put(candidato, newVoto);
                    }
                }
            }
        }

        return listaCandidatosP;
    }
