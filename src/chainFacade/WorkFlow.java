package chainFacade;

import chainFacade.processes.*;

public class WorkFlow {
    Notifier consultant = new Consultation(Priority.Consultation);
    Notifier document = new DocSubmission(Priority.DocSubmission);
    Notifier englishTest = new Ielts(Priority.IELTS);
    Notifier kazakhTest = new Kazakh(Priority.Kazakh);
    Notifier specTest = new SpecTest(Priority.SpecTest);
    Notifier interview = new Interview(Priority.Interview);


    public void startProcess(){
        consultant.setNextNotifier(document);
        document.setNextNotifier(englishTest);
        englishTest.setNextNotifier(kazakhTest);
        kazakhTest.setNextNotifier(specTest);
        specTest.setNextNotifier(interview);

        consultant.notifyManager("\nConsultation was successful!\n", Priority.Consultation);
        document.notifyManager("\nDocuments submitted!\n", Priority.DocSubmission);
        englishTest.notifyManager("\nEnglish test passed!\n", Priority.IELTS);
        kazakhTest.notifyManager("\nKazakh test passed!\n", Priority.Kazakh);
        specTest.notifyManager("\nSpecialization test passed!\n", Priority.SpecTest);
        interview.notifyManager("\nInterview was successful!\n", Priority.Interview);
    }
}
