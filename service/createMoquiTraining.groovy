def training = ec.entity.makeValue("moqui.training.MoquiTraining")
training.setFields(context, true, null, null)
if(!training.trainingId) training.setSequencedIdPrimary()
training.create();
