
import React from 'react';
import { render, screen } from '@testing-library/react';
import StudentList from './StudentList';

describe('StudentList Component', () => {
  const students = [
    { id: 1, name: 'John Doe' },
    { id: 2, name: 'Jane Smith' },
  ];

  test('renders the component with a title', () => {
    render(<StudentList students={students} />);
    const titleElement = screen.getByText(/Student List/i);
    expect(titleElement).toBeInTheDocument();
  });

  test('renders a list of students', () => {
    render(<StudentList students={students} />);
    const studentItems = screen.getAllByRole('listitem');
    expect(studentItems).toHaveLength(students.length);
    expect(studentItems[0]).toHaveTextContent('John Doe');
    expect(studentItems[1]).toHaveTextContent('Jane Smith');
  });

  test('handles an empty student list', () => {
    render(<StudentList students={[]} />);
    const studentItems = screen.queryAllByRole('listitem');
    expect(studentItems).toHaveLength(0);
  });
});
