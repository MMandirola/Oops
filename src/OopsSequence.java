public class OopsSequence extends OopsCode{
OopsCode[] sentences;
public OopsCode[] getSentences() {
	return sentences;
}
public void setSentences(OopsCode[] sentences) {
	this.sentences = sentences;
}
@Override
	public OopsObject evaluate(OopsState state) {
		OopsObject resultado = null;
		for(OopsCode code:sentences){
			resultado = code.evaluate(state);
		}
		return resultado;
		
	}
	public OopsSequence(OopsCode[] sentences) {
		this.sentences = sentences;
	}
}
