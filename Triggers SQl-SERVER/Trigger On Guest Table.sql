USE [classicmodels]
GO
/****** Object:  Trigger [dbo].[EmployeeMessage]    Script Date: 8/13/2023 6:42:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER   TRIGGER [dbo].[EmployeeMessage] ON [dbo].[employees]
AFTER DELETE
AS
PRINT 'Employee has been deleted'
BEGIN
   INSERT INTO Employee_Audit
   SELECT employeeNumber, lastName, firstName,extension, email, officeCode, reportsTo, jobTitle, GETDATE(), (SELECT ORIGINAL_LOGIN() AS OriginalLogin) FROM deleted
END
;