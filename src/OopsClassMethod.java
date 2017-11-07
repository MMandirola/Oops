
public class OopsClassMethod extends OopsMethod{

	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		if(self.clase != null){
			return self.clase;
		}
		else{
			return null;
		}
	}

}
