VBSlide : UGen {

	*ar {
		arg in, slideup = 50, slidedown = 3000, mul = 1.0, add = 0.0;
		^this.multiNew('audio', in, slideup, slidedown).madd(mul, add)
	}
	*kr {
		arg in, slideup = 50, slidedown = 3000, mul = 1.0, add = 0.0;
		^this.multiNew('control', in, slideup, slidedown).madd(mul, add)
	}
	checkInputs { ^this.checkSameRateAsFirstInput }
}