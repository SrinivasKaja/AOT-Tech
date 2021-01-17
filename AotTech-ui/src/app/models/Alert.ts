export class Alert {
    isAlert = false;
    severity: string;
    message: string;
    timeout = 5000;
    cssClass = "fade";
    constructor(init?:Partial<Alert>) {
        Object.assign(this, init);
    }
    hide() {
        this.isAlert = false;
    }
}
export enum Severity {
    INFO = "info",
    SUCCESS = "sucess",
    ERROR = 'error',
    WARN = 'warn',
    GENERAL = 'general'
}