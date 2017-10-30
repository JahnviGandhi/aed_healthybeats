/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.Constants;
import business.HelperMethods;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JAHNVI
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;
    
    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
    public WorkRequest addWorkRequest(WorkRequest request) {
        workRequestList.add(request);
        return request;
    }
    
    public void deleteWorkRequest(WorkRequest request) {
        workRequestList.remove(request);
    }
    
    public ArrayList<WorkRequest> searchRequestByDate(Date requestDate, ArrayList<String> status) {
        ArrayList<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest request : workRequestList) {
            if (HelperMethods.getDateFromStamp(request.getRequestDate().toString()).equals(HelperMethods.getDateFromStamp((requestDate.toString())))) {
                if (status.isEmpty() == true || status.size() == 3) {
                    requests.add(request);
                }
                else {
                    if(status.contains(request.getStatus())) {
                        requests.add(request);
                    }
                }
            }
        }
        
        return requests;
    }
    
    public ArrayList<WorkRequest> searchRequestByReceiver(String receiver, ArrayList<String> status) {
        ArrayList<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest request : workRequestList) {
            if (request.getReceiver().getPerson().getFirstName().equalsIgnoreCase(receiver)) {
                if (status.isEmpty() == true || status.size() == 3) {
                    requests.add(request);
                }
                else {
                    if(status.contains(request.getStatus())) {
                        requests.add(request);
                    }
                }
            }
        }
        
        return requests;
    }
    
    public ArrayList<WorkRequest> searchRequestByStatusOnly(ArrayList<String> status) {
        ArrayList<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest request : workRequestList) {
            if (status.isEmpty() == true || status.size() == 3) {
                requests.add(request);
            }
            else {
                if(status.contains(request.getStatus())) {
                    requests.add(request);
                }
            }
        }
        
        return requests;
    }
    
    public ArrayList<WorkRequest> searchRequestBySender(String sender, ArrayList<String> status) {
        ArrayList<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest request : workRequestList) {
            if (request.getSender().getPerson().getFirstName().equalsIgnoreCase(sender)) {
                if (status.isEmpty() == true || status.size() == 3) {
                    requests.add(request);
                }
                else {
                    if(status.contains(request.getStatus())) {
                        requests.add(request);
                    }
                }
            }
        }
        
        return requests;
    }
    
    public ArrayList<WorkRequest> getCompletedRequests() {
        ArrayList<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest wr : workRequestList) {
            if (wr.getStatus().equals(Constants.REQUEST_COMPLETED)) {
                requests.add(wr);
            }
        }
        
        return requests;
    }
    
    public ArrayList<WorkRequest> getCompletedRequestsForSender(UserAccount sender) {
        ArrayList<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest wr : workRequestList) {
            if (wr.getStatus().equals(Constants.REQUEST_COMPLETED) && wr.getSender().equals(sender)) {
                requests.add(wr);
            }
        }
        
        return requests;
    }
    
    public int getCountForUnAffectedResults() {
        int count = 0;
        HealthCheckRequest hcr;
        
        for (WorkRequest wr : workRequestList) {
            hcr = (HealthCheckRequest) wr;
            if (!hcr.getResult().equalsIgnoreCase("Health is affected.")) {
                count++;
            }
        }
        
        return count;
    }
}
